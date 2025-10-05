class Solution {
    public String validIPAddress(String s) {
        String ip4= "(([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])\\.){3}([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])";
        if(s.matches(ip4)){
            return "IPv4" ;
        }
        String ip6="((([0-9a-fA-F]){1,4})\\:){7}(([0-9a-fA-F]){1,4})";
        if(s.matches(ip6)){
            return "IPv6";
        }
        return "Neither";
    }
}