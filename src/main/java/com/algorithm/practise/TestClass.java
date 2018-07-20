package algostuff;

/**
 *
 * @author joel.eze
 */
public class TestClass {

    public static void main(String[] args) {
//        String strng = "*389*7777*833*100*08138249630#";
//        String[] bits = strng.split("\\*");
//        String newString  = bits[bits.length - 2];
//        System.out.println(newString);

//        App3DResponse app3DResponse = new App3DRequest()
//                .setClientID("skyeregclient000001")
//                .setProviderID("skyeregclient")
//                .setProviderName("skyeregclient")
//                .setAccountNumber("3050122237")
//                .setOtherInfo("2347039645560")
//                .setEnvironment(App3D.PRODUCTION)
//                .build();
//        System.out.println(app3DResponse.getOtherInfo());
//        System.out.println(app3DResponse.getAccountNumber());
//        System.out.println(app3DResponse.getProviderName());
//        System.out.println(app3DResponse.getXml());
//        System.out.println(app3DResponse.getResponseCode());
        String encodedString = "&lt;BillVerification&gt;&lt;Bill&gt;DSTV&lt;/Bill&gt;&lt;BillStatus&gt;OK&lt;/BillStatus&gt;&lt;BillAccountId&gt;1013339789&lt;/BillAccountId&gt;&lt;BillVerifiedOnline&gt;TRUE&lt;/BillVerifiedOnline&gt;&lt;BillAccountIdDetails&gt;1~85648229~SPMPEP FPTPKP&lt;/BillAccountIdDetails&gt;&lt;BillProductLists&gt;&lt;Product&gt;&lt;ProductName&gt;DStv FTA Plus&lt;/ProductName&gt;&lt;ProductAmount&gt;1600&lt;/ProductAmount&gt;&lt;/Product&gt;&lt;Product&gt;&lt;ProductName&gt;DStv Access&lt;/ProductName&gt;&lt;ProductAmount&gt;1800&lt;/ProductAmount&gt;&lt;/Product&gt;&lt;Product&gt;&lt;ProductName&gt;DStv Family&lt;/ProductName&gt;&lt;ProductAmount&gt;3600&lt;/ProductAmount&gt;&lt;/Product&gt;&lt;Product&gt;&lt;ProductName&gt;DStv Compact&lt;/ProductName&gt;&lt;ProductAmount&gt;6000&lt;/ProductAmount&gt;&lt;/Product&gt;&lt;Product&gt;&lt;ProductName&gt;DStv Compact Plus&lt;/ProductName&gt;&lt;ProductAmount&gt;9420&lt;/ProductAmount&gt;&lt;/Product&gt;&lt;Product&gt;&lt;ProductName&gt;DStv Premium&lt;/ProductName&gt;&lt;ProductAmount&gt;13980&lt;/ProductAmount&gt;&lt;/Product&gt;&lt;Product&gt;&lt;ProductName&gt;DStv Access + HDPVR/XtraView&lt;/ProductName&gt;&lt;ProductAmount&gt;3960&lt;/ProductAmount&gt;&lt;/Product&gt;&lt;Product&gt;&lt;ProductName&gt;DStv Family + HDPVR/XtraView&lt;/ProductName&gt;&lt;ProductAmount&gt;5760&lt;/ProductAmount&gt;&lt;/Product&gt;&lt;Product&gt;&lt;ProductName&gt;DStv Compact + HDPVR/XtraView&lt;/ProductName&gt;&lt;ProductAmount&gt;8160&lt;/ProductAmount&gt;&lt;/Product&gt;&lt;Product&gt;&lt;ProductName&gt;DStv Compact Plus + HDPVR/XtraView&lt;/ProductName&gt;&lt;ProductAmount&gt;11580&lt;/ProductAmount&gt;&lt;/Product&gt;&lt;Product&gt;&lt;ProductName&gt;DStv Premium + HDPVR/XtraView&lt;/ProductName&gt;&lt;ProductAmount&gt;16140&lt;/ProductAmount&gt;&lt;/Product&gt;&lt;/BillProductLists&gt;&lt;/BillVerification&gt;";
        String decodedString = encodedString.replaceAll("&lt;", "<").replaceAll("&gt;", ">");

        System.err.println(decodedString);

    }
    //&lt;BillVerification&gt;&lt;Bill&gt;DSTV&lt;/Bill&gt;&lt;BillStatus&gt;OK&lt;/BillStatus&gt;&lt;BillAccountId&gt;1013339789&lt;/BillAccountId&gt;&lt;BillVerifiedOnline&gt;TRUE&lt;/BillVerifiedOnline&gt;&lt;BillAccountIdDetails&gt;1~85648229~SPMPEP FPTPKP&lt;/BillAccountIdDetails&gt;&lt;BillProductLists&gt;&lt;Product&gt;&lt;ProductName&gt;DStv FTA Plus&lt;/ProductName&gt;&lt;ProductAmount&gt;1600&lt;/ProductAmount&gt;&lt;/Product&gt;&lt;Product&gt;&lt;ProductName&gt;DStv Access&lt;/ProductName&gt;&lt;ProductAmount&gt;1800&lt;/ProductAmount&gt;&lt;/Product&gt;&lt;Product&gt;&lt;ProductName&gt;DStv Family&lt;/ProductName&gt;&lt;ProductAmount&gt;3600&lt;/ProductAmount&gt;&lt;/Product&gt;&lt;Product&gt;&lt;ProductName&gt;DStv Compact&lt;/ProductName&gt;&lt;ProductAmount&gt;6000&lt;/ProductAmount&gt;&lt;/Product&gt;&lt;Product&gt;&lt;ProductName&gt;DStv Compact Plus&lt;/ProductName&gt;&lt;ProductAmount&gt;9420&lt;/ProductAmount&gt;&lt;/Product&gt;&lt;Product&gt;&lt;ProductName&gt;DStv Premium&lt;/ProductName&gt;&lt;ProductAmount&gt;13980&lt;/ProductAmount&gt;&lt;/Product&gt;&lt;Product&gt;&lt;ProductName&gt;DStv Access + HDPVR/XtraView&lt;/ProductName&gt;&lt;ProductAmount&gt;3960&lt;/ProductAmount&gt;&lt;/Product&gt;&lt;Product&gt;&lt;ProductName&gt;DStv Family + HDPVR/XtraView&lt;/ProductName&gt;&lt;ProductAmount&gt;5760&lt;/ProductAmount&gt;&lt;/Product&gt;&lt;Product&gt;&lt;ProductName&gt;DStv Compact + HDPVR/XtraView&lt;/ProductName&gt;&lt;ProductAmount&gt;8160&lt;/ProductAmount&gt;&lt;/Product&gt;&lt;Product&gt;&lt;ProductName&gt;DStv Compact Plus + HDPVR/XtraView&lt;/ProductName&gt;&lt;ProductAmount&gt;11580&lt;/ProductAmount&gt;&lt;/Product&gt;&lt;Product&gt;&lt;ProductName&gt;DStv Premium + HDPVR/XtraView&lt;/ProductName&gt;&lt;ProductAmount&gt;16140&lt;/ProductAmount&gt;&lt;/Product&gt;&lt;/BillProductLists&gt;&lt;/BillVerification&gt;

    public static String addChar(String tin, int pos) {
        return new StringBuilder(tin).insert(pos, "-").toString();
    }

}
