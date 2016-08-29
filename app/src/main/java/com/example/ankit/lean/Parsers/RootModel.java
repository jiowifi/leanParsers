import java.util.ArrayList;

class RootModel {

	public String description;
	public String state;
	public CopyrightModel _copyright;
	public int id;
	public ArrayList<Social_linksModel> social_links;
	public String type;
	public Call_for_papersModel _call_for_papers;
	public String timezone;
	public String location_name;
	public CreatorModel _creator;
	public String background_image;
	public VersionModel _version;
	public String code_of_conduct;
	public String logo;
	public String name;
	public String organizer_description;
	public String start_time;
	public String schedule_published_on;
	public String end_time;
	public String email;
	public String privacy;
	public String topic;
	public String organizer_name;

	public RootModel(String description, String state, CopyrightModel copyright, int id, ArrayList<Social_linksModel> social_links, String type, Call_for_papersModel call_for_papers, String timezone, String location_name, CreatorModel creator, String background_image, VersionModel version, String code_of_conduct, String logo, String name, String organizer_description, String start_time, String schedule_published_on, String end_time, String email, String privacy, String topic, String organizer_name) {

		this.description = description;
		this.state = state;
		this._copyright = copyright;
		this.id = id;
		this.social_links = social_links;
		this.type = type;
		this._call_for_papers = call_for_papers;
		this.timezone = timezone;
		this.location_name = location_name;
		this._creator = creator;
		this.background_image = background_image;
		this._version = version;
		this.code_of_conduct = code_of_conduct;
		this.logo = logo;
		this.name = name;
		this.organizer_description = organizer_description;
		this.start_time = start_time;
		this.schedule_published_on = schedule_published_on;
		this.end_time = end_time;
		this.email = email;
		this.privacy = privacy;
		this.topic = topic;
		this.organizer_name = organizer_name;

	}

}