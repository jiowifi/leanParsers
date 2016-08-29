import java.util.ArrayList;

class RootModel {

	public String privacy;
	public String location_name;
	public CopyrightModel _copyright;
	public String state;
	public String background_image;
	public String type;
	public String start_time;
	public String logo;
	public VersionModel _version;
	public String organizer_description;
	public String description;
	public String timezone;
	public String code_of_conduct;
	public String organizer_name;
	public Call_for_papersModel _call_for_papers;
	public String topic;
	public String end_time;
	public String schedule_published_on;
	public String email;
	public String name;
	public ArrayList<Social_linksModel> social_links;
	public CreatorModel _creator;
	public int id;

	public RootModel(String privacy, String location_name, CopyrightModel copyright, String state, String background_image, String type, String start_time, String logo, VersionModel version, String organizer_description, String description, String timezone, String code_of_conduct, String organizer_name, Call_for_papersModel call_for_papers, String topic, String end_time, String schedule_published_on, String email, String name, ArrayList<Social_linksModel> social_links, CreatorModel creator, int id) {

		this.privacy = privacy;
		this.location_name = location_name;
		this._copyright = copyright;
		this.state = state;
		this.background_image = background_image;
		this.type = type;
		this.start_time = start_time;
		this.logo = logo;
		this._version = version;
		this.organizer_description = organizer_description;
		this.description = description;
		this.timezone = timezone;
		this.code_of_conduct = code_of_conduct;
		this.organizer_name = organizer_name;
		this._call_for_papers = call_for_papers;
		this.topic = topic;
		this.end_time = end_time;
		this.schedule_published_on = schedule_published_on;
		this.email = email;
		this.name = name;
		this.social_links = social_links;
		this._creator = creator;
		this.id = id;

	}

}