package rt.spring.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TextEditorApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("text-editor-beans.xml");
        TextEditor te = (TextEditor) context.getBean("textEditor");
        te.spellCheck();

        JavaCollection jc = (JavaCollection) context.getBean("javaCollection");

        jc.getAddressList();
        jc.getAddressSet();
        jc.getAddressMap();
        jc.getAddressProp();
    }
}
