$("button").click(function() {
  $(this)
    .parent()
    .toggleClass("open");
});
$(".dropdown-multi-select .dropdown-multi-select-item").click(function() {
  $(this).toggleClass("active");
});