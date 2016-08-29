import java.util.ArrayList;

class RootModel {

	public String logo;
	public String email;
	public String background_image;
	public String organizer_description;
	public String privacy;
	public String timezone;
	public int id;
	public CopyrightModel _copyright;
	public String description;
	public String location_name;
	public String topic;
	public VersionModel _version;
	public String end_time;
	public String type;
	public String organizer_name;
	public Call_for_papersModel _call_for_papers;
	public String name;
	public CreatorModel _creator;
	public String schedule_published_on;
	public ArrayList<Social_linksModel> social_links;
	public String code_of_conduct;
	public String state;
	public String start_time;

	public RootModel(String logo, String email, String background_image, String organizer_description, String privacy, String timezone, int id, CopyrightModel copyright, String description, String location_name, String topic, VersionModel version, String end_time, String type, String organizer_name, Call_for_papersModel call_for_papers, String name, CreatorModel creator, String schedule_published_on, ArrayList<Social_linksModel> social_links, String code_of_conduct, String state, String start_time) {

		this.logo = logo;
		this.email = email;
		this.background_image = background_image;
		this.organizer_description = organizer_description;
		this.privacy = privacy;
		this.timezone = timezone;
		this.id = id;
		this._copyright = copyright;
		this.description = description;
		this.location_name = location_name;
		this.topic = topic;
		this._version = version;
		this.end_time = end_time;
		this.type = type;
		this.organizer_name = organizer_name;
		this._call_for_papers = call_for_papers;
		this.name = name;
		this._creator = creator;
		this.schedule_published_on = schedule_published_on;
		this.social_links = social_links;
		this.code_of_conduct = code_of_conduct;
		this.state = state;
		this.start_time = start_time;

	}

}