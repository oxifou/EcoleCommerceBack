<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<div class="row">
	<div class="col s4">
		<h5>Formulaire test</h5>
		<form method="post">
			<input type="hidden" name="id" value="${ test.idTest }" />
			
			<div class="input-field">
			
				<input id="test_nom" type="text" class="validate" name="nom" value="${ test.nom }" />
				<label for="test_nom">Nom</label>
				
				</div>
				
				<div class="input-field">
				<input id="test_niveau" type="text" class="validate" name="niveau" value="${ test.niveau }" />
				<label for="test_niveau">Niveau</label>
				
				
<!-- 				<input id="test_branch" type="text" class="validate" name="branche" value="${ test.branche }"/>
				<select name="Choisissez une branche" id="test_branch"> 
					<option value = "option1" > </option>
					<option value = "option2" > </option>
					<option value = "option3" > </option>
 					<c:forEach items="${ Branche.value }" var=branche>
						<option value = branche > </option>
					</c:forEach>   
				</select>-->
				
			</div>
			
			
			
			<c:if test="${ test.idTest  == null }">
				<button class="btn amber success waves-effect waves-light" type="submit">
					Continuer <i class="material-icons right">send</i>
				</button>
			</c:if>
			
			<c:if test="${ test.idTest  != null }">
				<a class="btn red waves-effect waves-light" href="${ pageContext.request.contextPath }/test">
					Annuler <i class="material-icons right">fast_rewind</i>
				</a>
				
				<button class="btn waves-effect waves-light" type="submit">
					Valider <i class="material-icons right">done</i>
				</button>
			</c:if>
		</form>
	</div>
	
	<div class="col s8">
		<c:if test="${ test.idTest  != null }">
			<div class="fixed-action-btn">
				<a href="${ pageContext.request.contextPath }/test/${ test.idTest  }/questionnaire/add" class="btn-floating btn-large red">
					<i class="large material-icons">add</i>
				</a>
			</div>
			
			
			<h5>Liste des questionnaires</h5>
			
			<div class="row">
				<c:forEach items="${ test.questionnaires }" var="questionnaire">
					<div class="col s2">
					
						<a class="red-text" href="${ pageContext.request.contextPath }/test/${ test.idTest  }/figure/${ questionnaire.idQuestionnaire }/delete"><i class="material-icons">delete</i></a>
			
					</div>
				</c:forEach>
			</div>
		</c:if>
	</div>
</div>