<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>

<!-- Langues -->
<ul id="langues" class="dropdown-content">
  <li><a href="?lang=fr">Français</a></li>
  <li><a href="?lang=en">English</a></li>
</ul>

<nav>
	<div class="nav-wrapper">
		<div class="container">
			<a href="#" class="brand-logo">Tetris - <spring:message code="${ titleCode }" /></a>
			
			
			<ul id="nav-mobile" class="right hide-on-med-and-down">
								
			
			</ul>
			
		</div>
	</div>
</nav>