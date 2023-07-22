package Part1.module5_ArraysAndCollections.lesson5_HomeWork.task2;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;

public class Hospital {

    public static void main(String[] args) {

        int patientCount = 30;
        float minTemperature = 32f;
        float maxTemperature = 40f;
        float temperatureRange = maxTemperature - minTemperature;
        float minNormalTemperature = 36.2f;
        float maxNormalTemperature = 36.9f;

        float[] patientTemperatures = new float[patientCount];

        for (int i = 0; i < patientTemperatures.length; i++) {
            patientTemperatures[i] = minTemperature + (float) (Math.ceil((Math.random() * temperatureRange) * 10) / 10);
        }

        System.out.println("Temperatures of Patients: " + Arrays.toString(patientTemperatures));
        System.out.println("Average Temperature of Patients: " + getAvgTemperature(patientTemperatures));
        System.out.println("Count of healthy Patients: " + getHealthyPatients
                (minNormalTemperature, maxNormalTemperature, patientTemperatures));
    }

    static float getAvgTemperature(float... patientTemperatures) {
        float sum = 0f;
        for (float t : patientTemperatures) {
            sum += t;
        }
        return (float) Math.round((sum / patientTemperatures.length * 10)) / 10;
    }

    static int getHealthyPatients(float start, float end, float... patientTemperatures) {
        int count = 0;
        for (float t : patientTemperatures) {
            if (t >= start && t <= end) {
                count++;
            }
        }
        return count;
    }
}
