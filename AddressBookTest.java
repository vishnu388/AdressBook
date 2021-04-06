import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;

public class AddressBookTest {
    ArrayList<contact> contact = new ArrayList<>();

    @Test
    public void whenPersonContactDetailsAddedToFile_ShouldReturn_True() {
        contact contact1 = new contact("Vishnu","Vardhan" ,"Ongole","Ongole","Andhrapradesh", "Vishnu388@gmail.com",8106261925L, 523001);
        contact contact2 = new contact("Kiran","Kumar","Ongole","Ongole","Andhrapradesh", "Kirankumar@gmail.com",9989988301L, 523301);

        AddressBookIO addressBook = new AddressBookIO();
        contact.add(contact1);
        contact.add(contact2);

        boolean isAdded = addressBook.addContact(contact);

        Assert.assertTrue(isAdded);
    }

    @Test
    public void PersonContactDetailsAddedToFile_WhenRead_ShouldReturn_True() throws IOException {
        contact contact1 = new contact("Vishnu","Vardhan" ,"Ongole","Ongole","Andhrapradesh", "Vishnu388@gmail.com",8106261925L, 523001);
        contact contact2 = new contact("Kiran","Kumar","ongole","Ongole","Andhrapradesh", "kirankumar@gmail.com",9989988301L, 523301);

        AddressBookIO addressBook = new AddressBookIO();
        contact.add(contact1);
        contact.add(contact2);

        boolean isAdded = addressBook.addContact(contact);
        if (isAdded) {
            boolean isRead = addressBook.viewContact();
            Assert.assertTrue(isAdded);
        }


    }
}
