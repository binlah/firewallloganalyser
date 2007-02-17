<%@ include file="/WEB-INF/jsp/includes.jsp" %>

<html>
<body>
<h1>Page View Statistics</h1>
<hr>
<cewolf:chart 
    id="bar" 
    title="Page View Statistics" 
    type="verticalbar" 
    xaxislabel="Page" 
    yaxislabel="Views">
    <cewolf:data>
        <cewolf:producer id="event"/>
    </cewolf:data>
</cewolf:chart>
<p>
<cewolf:img chartid="bar" renderer="cewolf" width="400" height="300"/>
</P>
</body>
</html>