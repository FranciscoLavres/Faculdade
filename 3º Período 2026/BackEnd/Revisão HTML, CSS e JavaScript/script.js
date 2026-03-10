function validar(){
    
    const nome = document.getElementById("nome").value
    const sexo = document.getElementById("sexo").value
    const email = document.getElementById("email").value
    const noites = document.getElementById("noites").value
    const data = document.getElementById("data").value
    const hospedes = document.getElementById("hospedes").value
    
    if(nome === "") {
        alert("O campo nome deve ser preenchido.");
        return false;
    }

    else if(sexo === "") {
        alert("O campo sexo deve ser preenchido.");
        return false;
        }

    else if(email === "") {
        alert("O campo email deve ser preenchido.");
        return false;
    }

    else if(data === "") {
        alert("O campo data deve ser preenchido.");
        return false;
    }

    else if(noites === "") {
        alert("O campo noites deve ser preenchido.");
        return false;
    }

    else if(hospedes === "") {
        alert("O campo hospedes deve ser preenchido.");
        return false;
    }

    else {
    alert("Formulário válido! Enviando...");
    }
}
