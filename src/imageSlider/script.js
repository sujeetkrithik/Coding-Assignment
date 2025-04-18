const images = [
    'https://picsum.photos/id/1015/600/400',
    'https://picsum.photos/id/1016/600/400',
    'https://picsum.photos/id/1018/600/400',
    'https://picsum.photos/id/1019/600/400'
  ];

  let currentIndex = 0;

  const sliderImage = document.getElementById('sliderImage');
  const prevBtn = document.getElementById('prevBtn');
  const nextBtn = document.getElementById('nextBtn');

  sliderImage.src = images[currentIndex];

  nextBtn.addEventListener('click', () => {
    currentIndex = (currentIndex + 1) % images.length;
    sliderImage.src = images[currentIndex];
  });

  prevBtn.addEventListener('click', () => {
    currentIndex = (currentIndex - 1 + images.length) % images.length;
    sliderImage.src = images[currentIndex];
  });
