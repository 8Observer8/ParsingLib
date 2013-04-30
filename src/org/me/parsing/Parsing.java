/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.me.parsing;

/**
 * The Parsing data accepted with NMEA protocol
 *
 * @author Ivan
 */
public class Parsing {
    public Parsing() {
        setValuesInZero();
    }

    /**
     * Parses the data from the NMEA protocol
     * 
     * @param strBuf The buffer for parsing
     * @return The analysis occurred or not
     */
    public static boolean parsingData(String strBuf) {
        return false;
    }

    /**
     * The latitude
     */
    public double getLatitude() {
        return m_latitude;
    }

    /**
     * The longitude
     */
    public double getLongitude() {
        return m_longitude;
    }

    /**
     * The altitude
     */
    public double getAltitude() {
        return m_altitude;
    }

    /** 
     * The speed
     */
    public double getSpeed() {
        return m_speed;
    }

    /**
     * The number of the satellites
     */
    public int getNSatellites() {
        return m_nSatellites;
    }

    /**
     * Data in the GPGGA are correct or not
     */
    public boolean isFixGPGGA() {
        return m_isFixGPGGA;
    }

    /**
     * Data in the GPRMC are correct or not
     */
    public boolean isFixGPRMC() {
        return m_isFixGPRMC;
    }

    private void setValuesInZero() {
        m_latitude = 0;
        m_longitude = 0;
        m_altitude = 0;
        m_time = 0;
        m_speed = 0;
        m_nSatellites = 0;
        m_isFixGPGGA = false;
        m_isFixGPRMC = false;
    }
    /**
     * The latitude
     */
    private double m_latitude;
    /**
     * The longitude
     */
    private double m_longitude;
    /**
     * The altitude
     */
    private double m_altitude;
    /**
     * The speed
     */
    private double m_speed;
    /**
     * The time
     */
    private int m_time;
    /**
     * The number of the satellites
     */
    private int m_nSatellites;
    /**
     * Data in the GPGGA are correct or not
     */
    private boolean m_isFixGPGGA;
    /**
     * Data in the GPRMC are correct or not
     */
    private boolean m_isFixGPRMC;
}
