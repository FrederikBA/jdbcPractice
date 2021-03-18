package Entry;

import Services.MemberMapper;

public class Main {
    public static void main(String[] args) {
        MemberMapper memberMapper = new MemberMapper();
        while(true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            memberMapper.showAllMembers();
        }

    }
}
