package pooja.cucumber.demo.tests.base;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang3.RandomStringUtils;

import jakarta.mail.Flags;
import jakarta.mail.Folder;
import jakarta.mail.Message;
import jakarta.mail.MessagingException;
import jakarta.mail.NoSuchProviderException;
import jakarta.mail.Session;

import jakarta.mail.Store;
import jakarta.mail.Flags.Flag;
import jakarta.mail.search.FlagTerm;

public class BaseE2ETest {

	public static String applicantIDLocalStorage = "";

	public String readEmail(String subject, String patternText) throws Exception {
		String host = "imap.gmail.com";
		String mailStoreType = "imaps";
		String username = "yourgmail@gmail.com";
		String password = "pasword";
		String OTP = "";
		try {

			// create properties
			Properties properties = new Properties();

			properties.put("mail.imap.host", host);
			properties.put("mail.imap.port", "993");
			properties.put("mail.imap.starttls.enable", "true");
			properties.put("mail.imap.ssl.trust", host);

			Session emailSession = Session.getDefaultInstance(properties);

			// create the imap store object and connect to the imap server
			Store store = emailSession.getStore(mailStoreType);

			store.connect(host, username, password);

			// create the inbox object and open it
			Folder inbox = store.getFolder("Inbox");
			inbox.open(Folder.READ_WRITE);

			// retrieve the messages from the folder in an array and print it
			Message[] messages = inbox.search(new FlagTerm(new Flags(Flag.SEEN), false));

			if (messages.length > 0) {
				Message message = messages[messages.length - 1];
				message.setFlag(Flag.SEEN, true);
				String emailSubject = subject;

				if (message.getSubject().contains(emailSubject)) {
					// patternText i.e. "\\d{3}-\\d{3}"
					Pattern pattern = Pattern.compile(patternText);
					Matcher matcher = pattern.matcher(message.getContent().toString());

					while (matcher.find()) {
						OTP = matcher.group();
					}
				}
			}
			inbox.close(false);
			store.close();

		} catch (NoSuchProviderException e) {
			e.printStackTrace();
		} catch (MessagingException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return OTP;
	}

	/**
	 * @param size : String size to get random string
	 * @return String : Random alphabetic string with specified size
	 */
	public String randomestring(int size) {
		String generatedstring = RandomStringUtils.randomAlphabetic(size);
		return (generatedstring);
	}

	/**
	 * @param size : Number size to get random number
	 * @return String : Random numeric string with specified size
	 */
	public static String randomeNum(int size) {
		String generatedString2 = RandomStringUtils.randomNumeric(size);
		return (generatedString2);
	}

}
