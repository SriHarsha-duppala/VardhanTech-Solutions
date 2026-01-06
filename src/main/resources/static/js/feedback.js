const FEEDBACK_API = "http://localhost:8080/api/feedback";

document.getElementById("feedbackForm").addEventListener("submit", async function (e) {
  e.preventDefault();

  const feedbackData = {
    name: document.getElementById("fbName").value.trim(),
    rating: document.getElementById("fbRating").value,
    message: document.getElementById("fbMessage").value.trim()
  };

  const response = await fetch(FEEDBACK_API, {
    method: "POST",
    headers: { "Content-Type": "application/json" },
    body: JSON.stringify(feedbackData)
  });

  if (response.ok) {
    alert("⭐ Thank you for your feedback!");
    document.getElementById("feedbackForm").reset();
  } else {
    alert("❌ Feedback not submitted.");
  }
});
