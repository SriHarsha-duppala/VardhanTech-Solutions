const FEEDBACK_API = "http://localhost:8080/api/feedback";

async function loadHomeFeedback() {
  const response = await fetch(FEEDBACK_API);
  const feedbacks = await response.json();

  const list = document.getElementById("homeFeedbackList");
  list.innerHTML = "";

  feedbacks.forEach(f => {
    list.innerHTML += `
      <div class="card">
        <strong>${f.name}</strong><br>
        ⭐ ${f.rating}/5
        <p>${f.message}</p>
      </div>
    `;
  });
}

loadHomeFeedback();
