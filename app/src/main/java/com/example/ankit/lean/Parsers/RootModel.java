import java.util.ArrayList;

class RootModel {

	public String type;
	public String name;
	public String code_of_conduct;
	public String schedule_published_on;
	public String organizer_name;
	public String topic;
	public String logo;
	public String privacy;
	public String end_time;
	public int id;
	public String timezone;
	public String location_name;
	public String email;
	public String state;
	public String description;
	public Call_for_papersModel _call_for_papers;
	public VersionModel _version;
	public String start_time;
	public String organizer_description;
	public CreatorModel _creator;
	public String background_image;
	public CopyrightModel _copyright;
	public ArrayList<Social_linksModel> social_links;

	public RootModel(String type, String name, String code_of_conduct, String schedule_published_on, String organizer_name, String topic, String logo, String privacy, String end_time, int id, String timezone, String location_name, String email, String state, String description, Call_for_papersModel call_for_papers, VersionModel version, String start_time, String organizer_description, CreatorModel creator, String background_image, CopyrightModel copyright, ArrayList<Social_linksModel> social_links) {

		this.type = type;
		this.name = name;
		this.code_of_conduct = code_of_conduct;
		this.schedule_published_on = schedule_published_on;
		this.organizer_name = organizer_name;
		this.topic = topic;
		this.logo = logo;
		this.privacy = privacy;
		this.end_time = end_time;
		this.id = id;
		this.timezone = timezone;
		this.location_name = location_name;
		this.email = email;
		this.state = state;
		this.description = description;
		this._call_for_papers = call_for_papers;
		this._version = version;
		this.start_time = start_time;
		this.organizer_description = organizer_description;
		this._creator = creator;
		this.background_image = background_image;
		this._copyright = copyright;
		this.social_links = social_links;

	}

}