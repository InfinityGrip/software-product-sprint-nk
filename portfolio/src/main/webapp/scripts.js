/** Fetches the current date from the server and adds it to the page. */
async function showServerString() {
  const responseFromServer = await fetch('/MyServelt');
  //const textFromResponse = await responseFromServer.text();
  const stats = await responseFromServer.json();

  //const dateContainer = document.getElementById('date-container');
  //dateContainer.innerText = textFromResponse;
  //const Quoat = stats;

  // Pick a random greeting.
  const Quoat = stats[Math.floor(Math.random() * stats.length)];

  // Add it to the page.
  const quoatContainer = document.getElementById('container');
  quoatContainer.innerText = Quoat;
}

