/*
 *CarRates is used to represent the name of a class of rental car,
 *such as "Compact" and all associated prices (e.g. weekly rate, weekday rate)
 */
package pricing;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 *
 * @author Joseph Sant
 */
public class PriceSchedule implements Serializable {
  static {
    CodeCoverCoverageCounter$6ou56r5lnb5w3xfhwr8a6yxz2d7l.ping();
  }

     private String typeName;
     private BigDecimal weekdayRate;
     private BigDecimal weekendRate;
     private BigDecimal weeklyRate;

    public PriceSchedule(String typeName, BigDecimal weekdayRate, BigDecimal weekendRate, BigDecimal weeklyRate) {
        this.typeName = typeName;
CodeCoverCoverageCounter$6ou56r5lnb5w3xfhwr8a6yxz2d7l.statements[1]++;
        this.weekdayRate = weekdayRate;
CodeCoverCoverageCounter$6ou56r5lnb5w3xfhwr8a6yxz2d7l.statements[2]++;
        this.weekendRate = weekendRate;
CodeCoverCoverageCounter$6ou56r5lnb5w3xfhwr8a6yxz2d7l.statements[3]++;
        this.weeklyRate = weeklyRate;
CodeCoverCoverageCounter$6ou56r5lnb5w3xfhwr8a6yxz2d7l.statements[4]++;
    }

    public PriceSchedule() {
    }

    /**
     * @return the typeName
     */
    public String getTypeName() {
        return typeName;
    }

    /**
     * @param typeName the typeName to set
     */
    public void setTypeName(String typeName) {
        this.typeName = typeName;
CodeCoverCoverageCounter$6ou56r5lnb5w3xfhwr8a6yxz2d7l.statements[5]++;
    }

    /**
     * @return the weekdayRate
     */
    public BigDecimal getWeekdayRate() {
        return weekdayRate;
    }

    /**
     * @param weekdayRate the weekdayRate to set
     */
    public void setWeekdayRate(BigDecimal weekdayRate) {
        this.weekdayRate = weekdayRate;
CodeCoverCoverageCounter$6ou56r5lnb5w3xfhwr8a6yxz2d7l.statements[6]++;
    }

    /**
     * @return the weekendRate
     */
    public BigDecimal getWeekendRate() {
        return weekendRate;
    }

    /**
     * @param weekendRate the weekendRate to set
     */
    public void setWeekendRate(BigDecimal weekendRate) {
        this.weekendRate = weekendRate;
CodeCoverCoverageCounter$6ou56r5lnb5w3xfhwr8a6yxz2d7l.statements[7]++;
    }

    /**
     * @return the weeklyRate
     */
    public BigDecimal getWeeklyRate() {
        return weeklyRate;
    }

    /**
     * @param weeklyRate the weeklyRate to set
     */
    public void setWeeklyRate(BigDecimal weeklyRate) {
        this.weeklyRate = weeklyRate;
CodeCoverCoverageCounter$6ou56r5lnb5w3xfhwr8a6yxz2d7l.statements[8]++;
    }

    @Override
    public String toString() {
        return "CarRates{" + "typeName=" + typeName +
                ", weekdayRate=" + weekdayRate +
                ", weekendRate=" + weekendRate +
                ", weeklyRate=" + weeklyRate + '}';
    }    
}

class CodeCoverCoverageCounter$6ou56r5lnb5w3xfhwr8a6yxz2d7l extends org.codecover.instrumentation.java.measurement.CounterContainer {

  static {
    org.codecover.instrumentation.java.measurement.ProtocolImpl.getInstance(org.codecover.instrumentation.java.measurement.CoverageResultLogFile.getInstance(null), "da3cff5f-c93a-4d7d-9772-522c05ef95ac").addObservedContainer(new CodeCoverCoverageCounter$6ou56r5lnb5w3xfhwr8a6yxz2d7l ());
  }
    public static long[] statements = new long[9];
    public static long[] branches = new long[0];
    public static long[] loops = new long[1];

  public CodeCoverCoverageCounter$6ou56r5lnb5w3xfhwr8a6yxz2d7l () {
    super("pricing.PriceSchedule.java");
  }

  public static void ping() {/* nothing to do*/}

  public void reset() {
      for (int i = 1; i <= 8; i++) {
        statements[i] = 0L;
      }
      for (int i = 1; i <= -1; i++) {
        branches[i] = 0L;
      }
      for (int i = 1; i <= 0; i++) {
        loops[i] = 0L;
      }
  }

  public void serializeAndReset(org.codecover.instrumentation.measurement.CoverageCounterLog log) {
    log.startNamedSection("pricing.PriceSchedule.java");
      for (int i = 1; i <= 8; i++) {
        if (statements[i] != 0L) {
          log.passCounter("S" + i, statements[i]);
          statements[i] = 0L;
        }
      }
      for (int i = 1; i <= -1; i++) {
        if (branches[i] != 0L) {
          log.passCounter("B"+ i, branches[i]);
          branches[i] = 0L;
        }
      }
      for (int i = 1; i <= 0; i++) {
        if (loops[i * 3 - 2] != 0L) {
          log.passCounter("L" + i + "-0", loops[i * 3 - 2]);
          loops[i * 3 - 2] = 0L;
        }
        if ( loops[i * 3 - 1] != 0L) {
          log.passCounter("L" + i + "-1", loops[i * 3 - 1]);
          loops[i * 3 - 1] = 0L;
        }
        if ( loops[i * 3] != 0L) {
          log.passCounter("L" + i + "-2", loops[i * 3]);
          loops[i * 3] = 0L;
        }
      }
  }
}

