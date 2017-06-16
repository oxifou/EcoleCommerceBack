<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>




<div class="fixed-action-btn">
	<a href="test/edit" class="btn-floating btn-large red">
		<i class="large material-icons">add</i>
	</a>
</div>

<div class="row">
	<c:forEach items="${ tests }" var="test">
		<div class="col l3 s12">
			<div class="card">
				<div class="card-image waves-effect waves-block waves-light">
					<div class="activator valign-wrapper" style="height:17em;">
						<h5 class="valign white-text center-align" style="width: 100%;">${ test.nom }</h5>
					</div>
				</div>
				
				<div class="card-content">
					<span class="card-title activator grey-text text-darken-4">${ test.nom }<i class="material-icons right">more_vert</i></span>
				</div>
				
				
				<div class="card-action">
					<a href="test/delete/${ test.id }">RETIRER</a>
					<a href="test/edit/${ test.id }">EDITER</a>
				</div>
				
				<div class="card-reveal">
					<span class="card-title grey-text text-darken-4">${ tetrimino.nom }<i class="material-icons right">close</i></span>
					<table>
						<thead>
							<tr>
								<th data-field="name">Attribut</th>
								<th data-field="valeur">Valeur</th>
							</tr>
						</thead>
						
						<tbody>
							<tr>
								<td>ID</td>
								<td>${ test.id }</td>
							</tr>
							
							<tr>
								<td>Nom</td>
								<td>${ test.nom }</td>
							</tr>
						
							<tr>
								<td>Questionnaires</td>
								<td>${ test.questionnaires.size() }</td>
							</tr>
						</tbody>
					</table>
				</div>
			</div>
		</div>
	</c:forEach>
</div>