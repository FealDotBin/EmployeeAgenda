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
        java.lang.String deleteTelephoneNumber13mtemp = sampleAgendaServiceProxyid.deleteTelephoneNumber(id_1idTemp,telephoneNumber_2idTemp);
if(deleteTelephoneNumber13mtemp == null){
%>
<%=deleteTelephoneNumber13mtemp %>
<%
}else{
        String tempResultreturnp14 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(deleteTelephoneNumber13mtemp));
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
        java.lang.String insertTelephoneNumber20mtemp = sampleAgendaServiceProxyid.insertTelephoneNumber(id_3idTemp,telephoneNumber_4idTemp);
if(insertTelephoneNumber20mtemp == null){
%>
<%=insertTelephoneNumber20mtemp %>
<%
}else{
        String tempResultreturnp21 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(insertTelephoneNumber20mtemp));
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
        String telephoneNumber_10id=  request.getParameter("telephoneNumber43");
            java.lang.String telephoneNumber_10idTemp = null;
        if(!telephoneNumber_10id.equals("")){
         telephoneNumber_10idTemp  = telephoneNumber_10id;
        }
        String department_11id=  request.getParameter("department45");
            java.lang.String department_11idTemp = null;
        if(!department_11id.equals("")){
         department_11idTemp  = department_11id;
        }
        java.lang.String insertEmployee32mtemp = sampleAgendaServiceProxyid.insertEmployee(id_6idTemp,name_7idTemp,surname_8idTemp,email_9idTemp,telephoneNumber_10idTemp,department_11idTemp);
if(insertEmployee32mtemp == null){
%>
<%=insertEmployee32mtemp %>
<%
}else{
        String tempResultreturnp33 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(insertEmployee32mtemp));
        %>
        <%= tempResultreturnp33 %>
        <%
}
break;
case 47:
        gotMethod = true;
        String id_12id=  request.getParameter("id50");
            java.lang.String id_12idTemp = null;
        if(!id_12id.equals("")){
         id_12idTemp  = id_12id;
        }
        java.lang.String deleteEmployee47mtemp = sampleAgendaServiceProxyid.deleteEmployee(id_12idTemp);
if(deleteEmployee47mtemp == null){
%>
<%=deleteEmployee47mtemp %>
<%
}else{
        String tempResultreturnp48 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(deleteEmployee47mtemp));
        %>
        <%= tempResultreturnp48 %>
        <%
}
break;
case 52:
        gotMethod = true;
        String id_13id=  request.getParameter("id55");
            java.lang.String id_13idTemp = null;
        if(!id_13id.equals("")){
         id_13idTemp  = id_13id;
        }
        String name_14id=  request.getParameter("name57");
            java.lang.String name_14idTemp = null;
        if(!name_14id.equals("")){
         name_14idTemp  = name_14id;
        }
        String surname_15id=  request.getParameter("surname59");
            java.lang.String surname_15idTemp = null;
        if(!surname_15id.equals("")){
         surname_15idTemp  = surname_15id;
        }
        String email_16id=  request.getParameter("email61");
            java.lang.String email_16idTemp = null;
        if(!email_16id.equals("")){
         email_16idTemp  = email_16id;
        }
        String department_17id=  request.getParameter("department63");
            java.lang.String department_17idTemp = null;
        if(!department_17id.equals("")){
         department_17idTemp  = department_17id;
        }
        java.lang.String updateEmployee52mtemp = sampleAgendaServiceProxyid.updateEmployee(id_13idTemp,name_14idTemp,surname_15idTemp,email_16idTemp,department_17idTemp);
if(updateEmployee52mtemp == null){
%>
<%=updateEmployee52mtemp %>
<%
}else{
        String tempResultreturnp53 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(updateEmployee52mtemp));
        %>
        <%= tempResultreturnp53 %>
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