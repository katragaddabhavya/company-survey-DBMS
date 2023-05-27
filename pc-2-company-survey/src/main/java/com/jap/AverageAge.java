package com.jap;

public class AverageAge {

    public String averageAgeCalculator(String[] ageRawData) {
        double avg = 0;
        int sum=0;
        try {
            //Write the logic
            for (int i = 0; i <ageRawData.length; i++) {
                int age=Integer.parseInt(ageRawData[i]);
                sum=sum+age;
            }
            avg=sum/ageRawData.length;
            //Handle specific exception
        } catch (Exception exception) {
            return exception.toString();
        }
        return String.valueOf(avg);
    }

    public static void main(String[] args) {
        AverageAge Age = new AverageAge();
        String age[] = {"35", "26", "32", "44"};
        String average = Age.averageAgeCalculator(age);
        System.out.println(average);
    }
}