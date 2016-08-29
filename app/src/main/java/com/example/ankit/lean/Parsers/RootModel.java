import java.util.ArrayList;

class RootModel {

	public String email;
	public String state;
	public String privacy;
	public String location_name;
	public String code_of_conduct;
	public String type;
	public int id;
	public String organizer_description;
	public Call_for_papersModel _call_for_papers;
	public String timezone;
	public String organizer_name;
	public VersionModel _version;
	public CopyrightModel _copyright;
	public CreatorModel _creator;
	public ArrayList<Social_linksModel> social_links;
	public String logo;
	public String topic;
	public String schedule_published_on;
	public String end_time;
	public String start_time;
	public String name;
	public String background_image;
	public String description;

	public RootModel(String email, String state, String privacy, String location_name, String code_of_conduct, String type, int id, String organizer_description, Call_for_papersModel call_for_papers, String timezone, String organizer_name, VersionModel version, CopyrightModel copyright, CreatorModel creator, ArrayList<Social_linksModel> social_links, String logo, String topic, String schedule_published_on, String end_time, String start_time, String name, String background_image, String description) {

		this.email = email;
		this.state = state;
		this.privacy = privacy;
		this.location_name = location_name;
		this.code_of_conduct = code_of_conduct;
		this.type = type;
		this.id = id;
		this.organizer_description = organizer_description;
		this._call_for_papers = call_for_papers;
		this.timezone = timezone;
		this.organizer_name = organizer_name;
		this._version = version;
		this._copyright = copyright;
		this._creator = creator;
		this.social_links = social_links;
		this.logo = logo;
		this.topic = topic;
		this.schedule_published_on = schedule_published_on;
		this.end_time = end_time;
		this.start_time = start_time;
		this.name = name;
		this.background_image = background_image;
		this.description = description;

	}

}