package ttn.com.xml;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class XMlParsers extends DefaultHandler {
    private boolean mName = false;
    private boolean mDesignation = false;
    private boolean eName = false;
    private boolean eDesignation = false;
    private boolean team = false;
    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        if (qName.equalsIgnoreCase("ManagerName")){
            mName = true;
        }else if (qName.equalsIgnoreCase("ManagerDesignation")){
            mDesignation = true;
        }else if (qName.equalsIgnoreCase("EmployeeName")) {
            eName = true;
        }
        else if (qName.equalsIgnoreCase("EmployeeDesignation")) {
            eDesignation = true;
        }else if (qName.equalsIgnoreCase("Team")) {
            team = true;
        }
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        if (mName) {
            System.out.println("Manager Name " + new String(ch, start,length));
            mName = false;
        }else if (mDesignation) {
            System.out.println("Manager Designation "+ new String(ch,start,length));
            mDesignation = false;
        }else if (eName) {
            System.out.println("Employee Name "+ new String(ch,start,length) );
            eName = false;
        }else if (eDesignation) {
            System.out.println("Employee Designation "+ new String(ch,start,length));
            System.out.println("---------------------------------");
            System.out.println();
            eDesignation = false;
        }else if (team) {
            System.out.println("-------Team---------");
            team = false;
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        if (qName.equalsIgnoreCase("Manager")) {
            System.out.println("Now the xml parse done");
        }
    }
}

