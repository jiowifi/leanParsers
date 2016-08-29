import java.util.ArrayList;

class RootModel {

	public String end_time;
	public CopyrightModel _copyright;
	public CreatorModel _creator;
	public String background_image;
	public String code_of_conduct;
	public String organizer_name;
	public String timezone;
	public ArrayList<Social_linksModel> social_links;
	public String organizer_description;
	public String email;
	public String description;
	public String schedule_published_on;
	public String privacy;
	public VersionModel _version;
	public int id;
	public String logo;
	public String topic;
	public String name;
	public String start_time;
	public String location_name;
	public String type;
	public Call_for_papersModel _call_for_papers;
	public String state;

	public RootModel(String end_time, CopyrightModel copyright, CreatorModel creator, String background_image, String code_of_conduct, String organizer_name, String timezone, ArrayList<Social_linksModel> social_links, String organizer_description, String email, String description, String schedule_published_on, String privacy, VersionModel version, int id, String logo, String topic, String name, String start_time, String location_name, String type, Call_for_papersModel call_for_papers, String state) {

		this.end_time = end_time;
		this._copyright = copyright;
		this._creator = creator;
		this.background_image = background_image;
		this.code_of_conduct = code_of_conduct;
		this.organizer_name = organizer_name;
		this.timezone = timezone;
		this.social_links = social_links;
		this.organizer_description = organizer_description;
		this.email = email;
		this.description = description;
		this.schedule_published_on = schedule_published_on;
		this.privacy = privacy;
		this._version = version;
		this.id = id;
		this.logo = logo;
		this.topic = topic;
		this.name = name;
		this.start_time = start_time;
		this.location_name = location_name;
		this.type = type;
		this._call_for_papers = call_for_papers;
		this.state = state;

	}

}