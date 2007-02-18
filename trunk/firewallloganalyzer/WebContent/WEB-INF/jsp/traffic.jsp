<%@ include file="/WEB-INF/jsp/includes.jsp" %>

<html>
<body>
<jsp:include flush="true" page="head.jsp" />
<hr>
<h1>Page View Statistics</h1>
<hr>
<cewolf:chart 
    id="bar" 
    title="Event Overview" 
    type="verticalbar" 
    xaxislabel="Device" 
    yaxislabel="Events">
    <cewolf:data>
        <cewolf:producer id="event"/>
    </cewolf:data>
</cewolf:chart>
<p>
<cewolf:img chartid="bar" renderer="cewolf" width="500" height="400"/>
</P>
</body>
</html>