<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleAgendaServiceProxyid" scope="session" class="com.example.ws.AgendaServiceProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleAgendaServiceProxyid.setEndpoint(request.getParameter("endpoint"));
%>

<%
String method = request.getParameter("method");
int methodID = 0;
if (method == null) methodID = -1;

if(methodID != -1) methodID = Integer.parseInt(method);
boolean gotMethod = false;

try {
switch (methodID){ 
case 2:
        gotMethod = true;
        java.lang.String getEndpoint2mtemp = sampleAgendaServiceProxyid.getEndpoint();
if(getEndpoint2mtemp == null){
%>
<%=getEndpoint2mtemp %>
<%
}else{
        String tempResultreturnp3 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getEndpoint2mtemp));
        %>
        <%= tempResultreturnp3 %>
        <%
}
break;
case 5:
        gotMethod = true;
        String endpoint_0id=  request.getParameter("endpoint8");
            java.lang.String endpoint_0idTemp = null;
        if(!endpoint_0id.equals("")){
         endpoint_0idTemp  = endpoint_0id;
        }
        sampleAgendaServiceProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        com.example.ws.AgendaService getAgendaService10mtemp = sampleAgendaServiceProxyid.getAgendaService();
if(getAgendaService10mtemp == null){
%>
<%=getAgendaService10mtemp %>
<%
}else{
        if(getAgendaService10mtemp!= null){
        String tempreturnp11 = getAgendaService10mtemp.toString();
        %>
        <%=tempreturnp11%>
        <%
        }}
break;
case 13:
        gotMethod = true;
        String id_1id=  request.getParameter("id16");
            java.lang.String id_1idTemp = null;
        if(!id_1id.equals("")){
         id_1idTemp  = id_1id;
        }
        String telephoneNumber_2id=  request.getParameter("telephoneNumber18");
            java.lang.String telephoneNumber_2idTemp = null;
        if(!telephoneNumber_2id.equals("")){
         telephoneNumber_2idTemp  = telephoneNumber_2id;
        }
        java.lang.String insertTelephoneNumber13mtemp = sampleAgendaServiceProxyid.insertTelephoneNumber(id_1idTemp,telephoneNumber_2idTemp);
if(insertTelephoneNumber13mtemp == null){
%>
<%=insertTelephoneNumber13mtemp %>
<%
}else{
        String tempResultreturnp14 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(insertTelephoneNumber13mtemp));
        %>
        <%= tempResultreturnp14 %>
        <%
}
break;
case 20:
        gotMethod = true;
        String id_3id=  request.getParameter("id23");
            java.lang.String id_3idTemp = null;
        if(!id_3id.equals("")){
         id_3idTemp  = id_3id;
        }
        String telephoneNumber_4id=  request.getParameter("telephoneNumber25");
            java.lang.String telephoneNumber_4idTemp = null;
        if(!telephoneNumber_4id.equals("")){
         telephoneNumber_4idTemp  = telephoneNumber_4id;
        }
        java.lang.String deleteTelephoneNumber20mtemp = sampleAgendaServiceProxyid.deleteTelephoneNumber(id_3idTemp,telephoneNumber_4idTemp);
if(deleteTelephoneNumber20mtemp == null){
%>
<%=deleteTelephoneNumber20mtemp %>
<%
}else{
        String tempResultreturnp21 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(deleteTelephoneNumber20mtemp));
        %>
        <%= tempResultreturnp21 %>
        <%
}
break;
case 27:
        gotMethod = true;
        String id_5id=  request.getParameter("id30");
            java.lang.String id_5idTemp = null;
        if(!id_5id.equals("")){
         id_5idTemp  = id_5id;
        }
        java.lang.String searchEmployee27mtemp = sampleAgendaServiceProxyid.searchEmployee(id_5idTemp);
if(searchEmployee27mtemp == null){
%>
<%=searchEmployee27mtemp %>
<%
}else{
        String tempResultreturnp28 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(searchEmployee27mtemp));
        %>
        <%= tempResultreturnp28 %>
        <%
}
break;
case 32:
        gotMethod = true;
        String id_6id=  request.getParameter("id35");
            java.lang.String id_6idTemp = null;
        if(!id_6id.equals("")){
         id_6idTemp  = id_6id;
        }
        String name_7id=  request.getParameter("name37");
            java.lang.String name_7idTemp = null;
        if(!name_7id.equals("")){
         name_7idTemp  = name_7id;
        }
        String surname_8id=  request.getParameter("surname39");
            java.lang.String surname_8idTemp = null;
        if(!surname_8id.equals("")){
         surname_8idTemp  = surname_8id;
        }
        String email_9id=  request.getParameter("email41");
            java.lang.String email_9idTemp = null;
        if(!email_9id.equals("")){
         email_9idTemp  = email_9id;
        }
        String department_10id=  request.getParameter("department43");
            java.lang.String department_10idTemp = null;
        if(!department_10id.equals("")){
         department_10idTemp  = department_10id;
        }
        java.lang.String updateEmployee32mtemp = sampleAgendaServiceProxyid.updateEmployee(id_6idTemp,name_7idTemp,surname_8idTemp,email_9idTemp,department_10idTemp);
if(updateEmployee32mtemp == null){
%>
<%=updateEmployee32mtemp %>
<%
}else{
        String tempResultreturnp33 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(updateEmployee32mtemp));
        %>
        <%= tempResultreturnp33 %>
        <%
}
break;
case 45:
        gotMethod = true;
        String id_11id=  request.getParameter("id48");
            java.lang.String id_11idTemp = null;
        if(!id_11id.equals("")){
         id_11idTemp  = id_11id;
        }
        String name_12id=  request.getParameter("name50");
            java.lang.String name_12idTemp = null;
        if(!name_12id.equals("")){
         name_12idTemp  = name_12id;
        }
        String surname_13id=  request.getParameter("surname52");
            java.lang.String surname_13idTemp = null;
        if(!surname_13id.equals("")){
         surname_13idTemp  = surname_13id;
        }
        String email_14id=  request.getParameter("email54");
            java.lang.String email_14idTemp = null;
        if(!email_14id.equals("")){
         email_14idTemp  = email_14id;
        }
        String telephoneNumber_15id=  request.getParameter("telephoneNumber56");
            java.lang.String telephoneNumber_15idTemp = null;
        if(!telephoneNumber_15id.equals("")){
         telephoneNumber_15idTemp  = telephoneNumber_15id;
        }
        String department_16id=  request.getParameter("department58");
            java.lang.String department_16idTemp = null;
        if(!department_16id.equals("")){
         department_16idTemp  = department_16id;
        }
        java.lang.String insertEmployee45mtemp = sampleAgendaServiceProxyid.insertEmployee(id_11idTemp,name_12idTemp,surname_13idTemp,email_14idTemp,telephoneNumber_15idTemp,department_16idTemp);
if(insertEmployee45mtemp == null){
%>
<%=insertEmployee45mtemp %>
<%
}else{
        String tempResultreturnp46 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(insertEmployee45mtemp));
        %>
        <%= tempResultreturnp46 %>
        <%
}
break;
case 60:
        gotMethod = true;
        String id_17id=  request.getParameter("id63");
            java.lang.String id_17idTemp = null;
        if(!id_17id.equals("")){
         id_17idTemp  = id_17id;
        }
        java.lang.String deleteEmployee60mtemp = sampleAgendaServiceProxyid.deleteEmployee(id_17idTemp);
if(deleteEmployee60mtemp == null){
%>
<%=deleteEmployee60mtemp %>
<%
}else{
        String tempResultreturnp61 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(deleteEmployee60mtemp));
        %>
        <%= tempResultreturnp61 %>
        <%
}
break;
}
} catch (Exception e) { 
%>
Exception: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.toString()) %>
Message: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.getMessage()) %>
<%
return;
}
if(!gotMethod){
%>
result: N/A
<%
}
%>
</BODY>
</HTML>