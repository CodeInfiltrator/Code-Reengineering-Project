package org.jfree.chart;

import org.jfree.chart.plot.pie.PiePlot;
import java.awt.Font;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import org.jfree.chart.api.RectangleInsets;

public class ChartStyler {
    
    private static final double DEFAULT_INSET_TOP = 0.0;
    private static final double DEFAULT_INSET_LEFT = 5.0;
    private static final double DEFAULT_INSET_BOTTOM = 5.0;
    private static final double DEFAULT_INSET_RIGHT = 5.0;
    private static final String DEFAULT_NO_DATA_MESSAGE = "No data available";
    private static final Font DEFAULT_LABEL_FONT = new Font("SansSerif", Font.PLAIN, 12);

    public static void applyDefaultPiePlotStyle(PiePlot plot) {
        plot.setLabelGenerator(new StandardPieSectionLabelGenerator());
        plot.setInsets(new RectangleInsets(DEFAULT_INSET_TOP, DEFAULT_INSET_LEFT, DEFAULT_INSET_BOTTOM, DEFAULT_INSET_RIGHT));
        plot.setNoDataMessage(DEFAULT_NO_DATA_MESSAGE);
        plot.setLabelFont(DEFAULT_LABEL_FONT);
    }
}
