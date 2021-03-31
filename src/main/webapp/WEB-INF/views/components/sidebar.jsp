<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
    
    
    
<nav id="sidebarMenu" class="col-md-3 col-lg-2 d-md-block bg-light sidebar collapse">
      <div class="position-sticky pt-3">
        <ul class="nav flex-column">
          <li class="nav-item">
            <a class="nav-link active" aria-current="page" href="home">
              <svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="feather feather-home"><path d="M3 9l9-7 9 7v11a2 2 0 0 1-2 2H5a2 2 0 0 1-2-2z"></path><polyline points="9 22 9 12 15 12 15 22"></polyline></svg>
              Dashboard
            </a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="addRecipe">
              <svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="feather feather-file"><path d="M13 2H6a2 2 0 0 0-2 2v16a2 2 0 0 0 2 2h12a2 2 0 0 0 2-2V9z"></path><polyline points="13 2 13 9 20 9"></polyline></svg>
              Form Page
            </a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="/helloTest/KitchenController/AllRecList">
              <svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="feather feather-file"><path d="M13 2H6a2 2 0 0 0-2 2v16a2 2 0 0 0 2 2h12a2 2 0 0 0 2-2V9z"></path><polyline points="13 2 13 9 20 9"></polyline></svg>
              All Rec List
            </a>
          </li>

<!-- Room Navigation template -->
<!--   <li class="nav-item">
       <a class="nav-link disabled" href="#" >
       <svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="feather feather-shopping-cart"><circle cx="9" cy="21" r="1"></circle><circle cx="20" cy="21" r="1"></circle><path d="M1 1h4l2.68 13.39a2 2 0 0 0 2 1.61h9.72a2 2 0 0 0 2-1.61L23 6H6"></path></svg>
         Products
       </a>
       </li> -->
          
        </ul>
        
        
        <!-- Room Specific Component Links -->
		<c:if test="${roomTasks ne null}">
		<div>
        <h6 class="sidebar-heading d-flex justify-content-between align-items-center px-3 mt-4 mb-1 text-muted">
          <span> ${ roomName } Tasks</span>
          <a class="link-secondary" href="#" aria-label="Add a new report">
            <svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="feather feather-plus-circle"><circle cx="12" cy="12" r="10"></circle><line x1="12" y1="8" x2="12" y2="16"></line><line x1="8" y1="12" x2="16" y2="12"></line></svg>
          </a>
        </h6>
        <ul class="nav flex-column mb-2">
					<c:forEach var="task" items="${roomTasks}">

						<c:choose>
							<c:when test="${task.contains('List')}">
								<li class="nav-item"><a class="nav-link" href="#"> <i
										class="bi bi-cart"></i> ${task}
								</a></li>
							</c:when>
							<c:when test="${task.contains('Planner')}">
								<li class="nav-item"><a class="nav-link" href="#"> <i
										class="bi bi-card-checklist"></i> ${task}
								</a></li>
							</c:when>
							<c:when test="${task.contains('Book')}">
								<li class="nav-item"><a class="nav-link" href="${task.replace(' ', '') }"> <i
										class="bi bi-book"></i> ${task}
								</a></li>
							</c:when>
							<c:otherwise>
								<li class="nav-item"><a class="nav-link" href="#"> <i
										class="bi bi-bug"></i> ${task}
								</a></li>
							</c:otherwise>
						</c:choose>
					</c:forEach>
				</ul>
        </div>
        </c:if>
        <!-- Room Specific Component Links END -->
        
      </div>
    </nav>