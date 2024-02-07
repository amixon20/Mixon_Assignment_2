import java.io.*;

import org.jfree.chart.JFreeChart;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtils;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

public class Chart {

    public static void main(String[] args) {
        try {
            XYSeriesCollection seriesCollection = new XYSeriesCollection();

            // All values are for k-sorted data. Swapped these with random data results to create
            // other graph.
            XYSeries bubble = new XYSeries("Bubble Sort");
            bubble.add(100, 0.037321139999999996);
            bubble.add(500, 0.10571117);
            bubble.add(1000, 0.22009569);
            bubble.add(2000, 0.70464463);
            bubble.add(5000, 5.097061619999999);
            bubble.add(10000, 23.82584063);
            bubble.add(20000, 91.02239546);
            bubble.add(75000, 1419.7218749600002);
            bubble.add(150000, 5548.054196039999);
            seriesCollection.addSeries(bubble);

            XYSeries insertion = new XYSeries("Insertion Sort");
            insertion.add(100, 0.00960906);
            insertion.add(500, 0.03862648);
            insertion.add(1000, 0.13650236);
            insertion.add(2000, 0.20165794999999997);
            insertion.add(5000, 0.4282803);
            insertion.add(10000, 1.8208037);
            insertion.add(20000, 7.0398428299999996);
            insertion.add(75000, 102.45617644000001);
            insertion.add(150000, 446.58168392);
            seriesCollection.addSeries(insertion);

            XYSeries select = new XYSeries("Selection Sort");
            select.add(100, 0.01232664);
            select.add(500, 0.04769799);
            select.add(1000, 0.05438461);
            select.add(2000, 0.18104979999999998);
            select.add(5000, 1.3345059799999999);
            select.add(10000, 7.423033599999999);
            select.add(20000, 24.149178850000006);
            select.add(75000, 268.66687053);
            select.add(150000, 974.0321726899998);
            seriesCollection.addSeries(select);

            XYSeries merge = new XYSeries("Merge Sort");
            merge.add(100, 0.00814731);
            merge.add(500, 0.011563729999999998);
            merge.add(1000, 0.02374509);
            merge.add(2000, 0.05142019);
            merge.add(5000, 0.09682550999999999);
            merge.add(10000, 0.15362863);
            merge.add(20000, 0.24439896);
            merge.add(75000, 0.96635121);
            merge.add(150000, 1.24919261);
            seriesCollection.addSeries(merge);

            XYSeries shell = new XYSeries("Shell Sort");
            shell.add(100, 0.004477579999999999);
            shell.add(500, 0.027665880000000004);
            shell.add(1000, 0.022078490000000003);
            shell.add(2000, 0.03227729);
            shell.add(5000, 0.06839541);
            shell.add(10000, 0.15223500999999992);
            shell.add(20000, 0.34316519);
            shell.add(75000, 1.5747011199999998);
            shell.add(150000, 3.4981269);
            seriesCollection.addSeries(shell);

            XYSeries quick = new XYSeries("Quick Sort");
            quick.add(100, 0.00607968);
            quick.add(500, 0.007057539999999999);
            quick.add(1000, 0.01892473);
            quick.add(2000, 0.01822405);
            quick.add(5000, 0.05046673);
            quick.add(10000, 0.11085981);
            quick.add(20000, 0.2299327);
            quick.add(75000, 1.0222677599999999);
            quick.add(150000, 2.16829925);
            seriesCollection.addSeries(quick);

            JFreeChart chart = ChartFactory.createXYLineChart("Runtime for Sorting Algorithms (k-sorted)",
                    "Size of Array", "Runtime (ms)",
                    seriesCollection, PlotOrientation.VERTICAL, true,
                    true, false);

            XYPlot plot = (XYPlot) chart.getPlot();
            XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();

            renderer.setSeriesLinesVisible(0, true);
            renderer.setSeriesLinesVisible(1, true);

            plot.setRenderer(renderer);
            OutputStream out = new FileOutputStream("kchart.jpg");
            ChartUtils.writeChartAsJPEG(out, chart, 680, 440);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}