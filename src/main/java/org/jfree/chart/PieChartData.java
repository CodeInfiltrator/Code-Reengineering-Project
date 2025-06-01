package org.jfree.chart;

import org.jfree.data.general.PieDataset;

public class PieChartData {
    private PieDataset dataset;

    public PieChartData(PieDataset dataset) {
        this.dataset = dataset;
    }

    public PieDataset getDataset() {
        return dataset;
    }
}
