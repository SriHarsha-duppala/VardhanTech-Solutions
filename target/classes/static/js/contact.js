document.getElementById("contactForm").addEventListener("submit", function (event) {
  event.preventDefault();

  const contactData = {
    name: document.getElementById("name").value.trim(),
    email: document.getElementById("email").value.trim(),
    phone: document.getElementById("phone").value.trim(),
    message: document.getElementById("message").value.trim()
  };

  fetch("http://localhost:8080/api/contact", {
    method: "POST",
    headers: {
      "Content-Type": "application/json"
    },
    body: JSON.stringify(contactData)
  })
    .then(response => {
      if (response.ok) {
        alert("✅ Message sent successfully! Our team will contact you soon.");
        document.getElementById("contactForm").reset();
      } else {
        alert("❌ Failed to send message. Please try again.");
      }
    })
    .catch(error => {
      console.error("Error:", error);
      alert("⚠ Server error. Please try again later.");
    });
});
