package com.desgin.creational.builder;

/**
 * @author Skow <isysc1@163.com>
 * @description
 * @date 2021/5/23 6:46 下午
 */
public class Dishes {

    /**
     * 调味料
     */
    private String condiment;

    /**
     * 主料
     */
    private String food;

    @Override
    public String toString() {
        return "Dishes{" + "condiment='" + condiment + '\'' + ", food='" + food + '\'' + '}';
    }

    private Dishes(FoodBuilder foodBuilder) {
        /**
         * 调味料
         */
        this.condiment = foodBuilder.condiment;
        /**
         * 主料
         */
        this.food = foodBuilder.food;
    }

    /**
     * 静态内部类
     */
    public static class FoodBuilder {

        /**
         * 调味料
         */
        private String condiment;

        /**
         * 主料
         */
        private String food;

        public FoodBuilder buildCondiment(String condiment) {
            this.condiment = condiment;
            return this;
        }

        public FoodBuilder buildFood(String food) {
            this.food = food;
            return this;
        }

        public Dishes build() {
            return new Dishes(this);
        }
    }
}
