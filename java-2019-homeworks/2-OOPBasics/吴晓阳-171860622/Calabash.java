import java.util.Comparator;

enum Calabash {
    DAWA("大娃", Seniority.ONE, Color.RED),
    ERWA("二娃", Seniority.TWO, Color.ORRANGE),
    SANWA("三娃", Seniority.THREE, Color.YELLOW),
    SIWA("四娃", Seniority.FOUR, Color.GREEN),
    WUWA("五娃", Seniority.FIVE, Color.CYAN),
    LIUWA("六娃", Seniority.SIX, Color.BLUE),
    QIWA("七娃", Seniority.SEVEN, Color.PURPLE);


    String name;

    Seniority seniority;

    Color color;


    Calabash(String name, Seniority seniority, Color color) {
        this.name = name;
        this.seniority = seniority;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public Color getColor() {
        return color;
    }

    public Seniority getSeniority() {
        return seniority;
    }

    @Override
    public String toString() {
        return name;
    }

    enum Color {
        RED, ORRANGE, YELLOW, GREEN, CYAN, BLUE, PURPLE;

        @Override
        public String toString(){
            switch(this){
                case RED: return "红";
                case ORRANGE: return "橙";
                case YELLOW: return "黄";
                case GREEN: return "绿";
                case CYAN: return "青";
                case BLUE: return "蓝";
                case PURPLE: return "紫";
            }
            return "Error";
        }
    }

    enum Seniority {
        ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN;

        @Override
        public String toString() {
            switch (this) {
                case ONE:
                    return "老大";
                case TWO:
                    return "老二";
                case THREE:
                    return "老三";
                case FOUR:
                    return "老四";
                case FIVE:
                    return "老五";
                case SIX:
                    return "老六";
                case SEVEN:
                    return "老七";
            }
            return "Error";
        }
    }

    public final static Comparator<Calabash> FROM_OLD_TO_YOUNG = (o1, o2) -> {
        if (o1.seniority.ordinal() < o2.seniority.ordinal()) {
            return -1;
        } else if (o1.seniority.ordinal() > o2.seniority.ordinal()) {
            return 1;
        } else {
            return 0;
        }
    };

    public final static Comparator<Calabash> FROM_RED_TO_PURPLE = (o1, o2) -> {
        if (o1.color.ordinal() < o2.color.ordinal()) {
            return -1;
        } else if (o1.color.ordinal() > o2.color.ordinal()) {
            return 1;
        } else {
            return 0;
        }
    };
}
