package org.jfree.chart;

public class ChartOptions {
    private final boolean legend;
    private final boolean tooltips;
    private final boolean urls;

    public ChartOptions(boolean legend, boolean tooltips, boolean urls) {
        this.legend = legend;
        this.tooltips = tooltips;
        this.urls = urls;
    }

    public boolean isLegend() {
        return legend;
    }

    public boolean isTooltipsEnabled() {
        return tooltips;
    }

    public boolean isUrlsEnabled() {
        return urls;
    }
}
