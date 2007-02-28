<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page session="true"%>
<%@page import="org.jfree.chart.ChartRenderingInfo"%>
<%@page import="org.jfree.chart.ChartUtilities"%>
<%@page import="org.jfree.data.category.DefaultCategoryDataset"%>
<%@page import="org.jfree.chart.JFreeChart"%>
<%@page import="org.jfree.chart.ChartFactory"%>
<%@page import="org.jfree.chart.plot.PlotOrientation"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
//	 produce chart ....
   DefaultCategoryDataset defaultcategorydataset = new DefaultCategoryDataset();
   defaultcategorydataset.addValue( 10, "Page View", "1" );
   defaultcategorydataset.addValue( 4, "Page View", "2" );
   defaultcategorydataset.addValue( 15, "Page View", "3" );
   defaultcategorydataset.addValue( 14, "Page View", "4" );
   defaultcategorydataset.addValue( 14, "Page View", "5" );
   defaultcategorydataset.addValue( 14, "Page View", "6" );
   defaultcategorydataset.addValue( 14, "Page View", "7" );

   defaultcategorydataset.addValue( 5, "Unique Visitor", "1" );
   defaultcategorydataset.addValue( 7, "Unique Visitor", "2" );
   defaultcategorydataset.addValue( 14, "Unique Visitor", "3" );
   defaultcategorydataset.addValue( 3, "Unique Visitor", "4" );
   defaultcategorydataset.addValue( 3, "Unique Visitor", "5" );
   defaultcategorydataset.addValue( 3, "Unique Visitor", "6" );
   defaultcategorydataset.addValue( 3, "Unique Visitor", "7" );

   defaultcategorydataset.addValue( 6, "Returning Visitors", "1" );
   defaultcategorydataset.addValue( 17, "Returning Visitors", "2" );
   defaultcategorydataset.addValue( 12, "Returning Visitors", "3" );
   defaultcategorydataset.addValue( 7, "Returning Visitors", "4" );
   defaultcategorydataset.addValue( 7, "Returning Visitors", "5" );
   defaultcategorydataset.addValue( 7, "Returning Visitors", "6" );
   defaultcategorydataset.addValue( 7, "Returning Visitors", "7" );
   
   JFreeChart chart = ChartFactory.createBarChart( "สถิติรายวันในเดือน", "Day", "Hit Rate", defaultcategorydataset, PlotOrientation.VERTICAL, true, true, false );

//	 store it the way you want : here in session 
	session.setAttribute("chart", chart);

	// get ImageMap
	ChartRenderingInfo info = new ChartRenderingInfo();
	// populate the info
	chart.createBufferedImage(640, 400, info);
	String imageMap = ChartUtilities.getImageMap("map", info);
%>

<%=imageMap%>

<IMG src="chartviewer" usemap="#map">
</body>
</html>
