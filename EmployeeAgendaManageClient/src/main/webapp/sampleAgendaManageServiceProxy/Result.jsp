<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleAgendaManageServiceProxyid" scope="session" class="com.example.ws.AgendaManageServiceProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleAgendaManageServiceProxyid.setEndpoint(request.getParameter("endpoint"));
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
        java.lang.String getEndpoint2mtemp = sampleAgendaManageServiceProxyid.getEndpoint();
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
        sampleAgendaManageServiceProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        com.example.ws.AgendaManageService getAgendaManageService10mtemp = sampleAgendaManageServiceProxyid.getAgendaManageService();
if(getAgendaManageService10mtemp == null){
%>
<%=getAgendaManageService10mtemp %>
<%
}else{
        if(getAgendaManageService10mtemp!= null){
        String tempreturnp11 = getAgendaManageService10mtemp.toString();
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
        String name_2id=  request.getParameter("name18");
            java.lang.String name_2idTemp = null;
        if(!name_2id.equals("")){
         name_2idTemp  = name_2id;
        }
        String surname_3id=  request.getParameter("surname20");
            java.lang.String surname_3idTemp = null;
        if(!surname_3id.equals("")){
         surname_3idTemp  = surname_3id;
        }
        String email_4id=  request.getParameter("email22");
            java.lang.String email_4idTemp = null;
        if(!email_4id.equals("")){
         email_4idTemp  = email_4id;
        }
        String telephoneNumber_5id=  request.getParameter("telephoneNumber24");
            java.lang.String telephoneNumber_5idTemp = null;
        if(!telephoneNumber_5id.equals("")){
         telephoneNumber_5idTemp  = telephoneNumber_5id;
        }
        String department_6id=  request.getParameter("department26");
            java.lang.String department_6idTemp = null;
        if(!department_6id.equals("")){
         department_6idTemp  = department_6id;
        }
        java.lang.String insertEmployee13mtemp = sampleAgendaManageServiceProxyid.insertEmployee(id_1idTemp,name_2idTemp,surname_3idTemp,email_4idTemp,telephoneNumber_5idTemp,department_6idTemp);
if(insertEmployee13mtemp == null){
%>
<%=insertEmployee13mtemp %>
<%
}else{
        String tempResultreturnp14 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(insertEmployee13mtemp));
        %>
        <%= tempResultreturnp14 %>
        <%
}
break;
case 28:
        gotMethod = true;
        String id_7id=  request.getParameter("id31");
            java.lang.String id_7idTemp = null;
        if(!id_7id.equals("")){
         id_7idTemp  = id_7id;
        }
        String name_8id=  request.getParameter("name33");
            java.lang.String name_8idTemp = null;
        if(!name_8id.equals("")){
         name_8idTemp  = name_8id;
        }
        String surname_9id=  request.getParameter("surname35");
            java.lang.String surname_9idTemp = null;
        if(!surname_9id.equals("")){
         surname_9idTemp  = surname_9id;
        }
        String email_10id=  request.getParameter("email37");
            java.lang.String email_10idTemp = null;
        if(!email_10id.equals("")){
         email_10idTemp  = email_10id;
        }
        String department_11id=  request.getParameter("department39");
            java.lang.String department_11idTemp = null;
        if(!department_11id.equals("")){
         department_11idTemp  = department_11id;
        }
        java.lang.String updateEmployee28mtemp = sampleAgendaManageServiceProxyid.updateEmployee(id_7idTemp,name_8idTemp,surname_9idTemp,email_10idTemp,department_11idTemp);
if(updateEmployee28mtemp == null){
%>
<%=updateEmployee28mtemp %>
<%
}else{
        String tempResultreturnp29 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(updateEmployee28mtemp));
        %>
        <%= tempResultreturnp29 %>
        <%
}
break;
case 41:
        gotMethod = true;
        String id_12id=  request.getParameter("id44");
            java.lang.String id_12idTemp = null;
        if(!id_12id.equals("")){
         id_12idTemp  = id_12id;
        }
        java.lang.String deleteEmployee41mtemp = sampleAgendaManageServiceProxyid.deleteEmployee(id_12idTemp);
if(deleteEmployee41mtemp == null){
%>
<%=deleteEmployee41mtemp %>
<%
}else{
        String tempResultreturnp42 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(deleteEmployee41mtemp));
        %>
        <%= tempResultreturnp42 %>
        <%
}
break;
case 46:
        gotMethod = true;
        String id_13id=  request.getParameter("id49");
            java.lang.String id_13idTemp = null;
        if(!id_13id.equals("")){
         id_13idTemp  = id_13id;
        }
        String telephoneNumber_14id=  request.getParameter("telephoneNumber51");
            java.lang.String telephoneNumber_14idTemp = null;
        if(!telephoneNumber_14id.equals("")){
         telephoneNumber_14idTemp  = telephoneNumber_14id;
        }
        java.lang.String deleteTelephoneNumber46mtemp = sampleAgendaManageServiceProxyid.deleteTelephoneNumber(id_13idTemp,telephoneNumber_14idTemp);
if(deleteTelephoneNumber46mtemp == null){
%>
<%=deleteTelephoneNumber46mtemp %>
<%
}else{
        String tempResultreturnp47 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(deleteTelephoneNumber46mtemp));
        %>
        <%= tempResultreturnp47 %>
        <%
}
break;
case 53:
        gotMethod = true;
        String id_15id=  request.getParameter("id56");
            java.lang.String id_15idTemp = null;
        if(!id_15id.equals("")){
         id_15idTemp  = id_15id;
        }
        String telephoneNumber_16id=  request.getParameter("telephoneNumber58");
            java.lang.String telephoneNumber_16idTemp = null;
        if(!telephoneNumber_16id.equals("")){
         telephoneNumber_16idTemp  = telephoneNumber_16id;
        }
        java.lang.String insertTelephoneNumber53mtemp = sampleAgendaManageServiceProxyid.insertTelephoneNumber(id_15idTemp,telephoneNumber_16idTemp);
if(insertTelephoneNumber53mtemp == null){
%>
<%=insertTelephoneNumber53mtemp %>
<%
}else{
        String tempResultreturnp54 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(insertTelephoneNumber53mtemp));
        %>
        <%= tempResultreturnp54 %>
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