package org.jfree.chart;
import org.jfree.data.general.PieDataset;

public class PieChartConfig {
    private String title;
    private PieDataset dataset;
    private boolean legend;
    private boolean tooltips;
    private boolean urls;

    public PieChartConfig(String title, PieDataset dataset, boolean legend, boolean tooltips, boolean urls) {
        this.title = title;
        this.dataset = dataset;
        this.legend = legend;
        this.tooltips = tooltips;
        this.urls = urls;
    }

    // Getter methods
    public String getTitle() { return title; }
    public PieDataset getDataset() { return dataset; }
    public boolean isLegend() { return legend; }
    public boolean isTooltips() { return tooltips; }
    public boolean isUrls() { return urls; }
}
