package charpet4;

public enum DemoEnum {
    Xiaomi("mi"),Redmi("redmi"),HuaWei("huawei"),Iphone("apple");
    private final String sign;

    DemoEnum(String sign) {
        this.sign = sign;
    }

    public static void main(String[] args) {
//        for (DemoEnum phone:DemoEnum.values()
//             ) {
//            System.out.println("phone = " + phone);
//            System.out.println("phone.name() = " + phone.name());
//        }
        DemoEnum redmi = valueOf("Iphone");
        System.out.println("redmi.name() = " + redmi.name());
        System.out.println("redmi = " + redmi);
    }

    @Override
    public String toString() {
        return "DemoEnum{" +
                "sign='" + sign + '\'' +
                '}';
    }
    
}
