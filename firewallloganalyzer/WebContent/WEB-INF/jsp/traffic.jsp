<%@ include file="/WEB-INF/jsp/includes.jsp" %>

<html>
<body>
<jsp:include flush="true" page="head.jsp" />
<hr>
<h1>Traffic Overview</h1>
<hr>
<cewolf:chart 
    id="bar" 
    title="Traffic Overview" 
    type="verticalbar" 
    xaxislabel="Device" 
    yaxislabel="Total Traffic(MB)">
    <cewolf:data>
        <cewolf:producer id="traffic"/>
    </cewolf:data>
</cewolf:chart>
<p>
<cewolf:img chartid="bar" renderer="cewolf" width="500" height="400"/>
</P>
</body>
</html>