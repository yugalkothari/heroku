<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="../common/header.jspf"%>

<div class="container">
    <div class="row">
        <div class="span3">
            <%@ include file="../common/sidebar.jspf"%>
        </div>
        <div class="span9">
            <div class="well">
                <div class="page-header">
                    <h1>Create a new todo</h1>
                </div>

                <sf:form id="createTodoForm" action="/user/todos/new.do" method="post" class="form-horizontal" modelAttribute="todo">

                    <fieldset>

                        <div class="control-group">
                            <label class="control-label" for="title">Title:</label>
                            <div class="controls">
                                <sf:input type="text" id="title" path="title" required="required" autofocus="autofocus" />
                            </div>
                        </div>


                        <div class="control-group">
                            <label class="control-label" for="priority">Priority:</label>
                            <div class="controls">
                                <sf:select id="priority" path="priority">
                                  <sf:option value="LOW">Low</sf:option>
                                  <sf:option value="MEDIUM">Medium</sf:option>
                                  <sf:option value="HIGH">High</sf:option>
                                </sf:select>
                            </div>
                        </div>

                        <div class="form-actions">
                            <button type="submit" class="btn btn-primary"> <i class="icon-ok icon-white"></i> Create</button>
                            <button type="button" class="btn" onclick="history.go(-1)"><i class="icon-remove"></i> Cancel</button>
                        </div>

                    </fieldset>

                </sf:form>

            </div>
        </div>
    </div>
</div>

<%--end content--%>
<%@ include file="../common/footer.jspf"%>
