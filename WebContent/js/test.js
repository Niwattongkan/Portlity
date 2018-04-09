function printPDF() {
	var pdf = new jsPDF();
	var cover = 'images/pictures/InformationTechnology/cover.jpg';
	pdf.addImage(cover,'JPEG',0,0,210,310);
	pdf.save();
}
