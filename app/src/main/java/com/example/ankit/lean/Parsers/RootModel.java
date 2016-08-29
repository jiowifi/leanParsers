import java.util.ArrayList;

class RootModel {

	public String type;
	public String name;
	public CopyrightModel _copyright;
	public String background_image;
	public String description;
	public String timezone;
	public String organizer_description;
	public CreatorModel _creator;
	public String end_time;
	public String state;
	public Call_for_papersModel _call_for_papers;
	public String logo;
	public String code_of_conduct;
	public String schedule_published_on;
	public ArrayList<Social_linksModel> social_links;
	public String topic;
	public VersionModel _version;
	public String start_time;
	public String organizer_name;
	public String location_name;
	public int id;
	public String privacy;
	public String email;

	public RootModel(String type, String name, CopyrightModel copyright, String background_image, String description, String timezone, String organizer_description, CreatorModel creator, String end_time, String state, Call_for_papersModel call_for_papers, String logo, String code_of_conduct, String schedule_published_on, ArrayList<Social_linksModel> social_links, String topic, VersionModel version, String start_time, String organizer_name, String location_name, int id, String privacy, String email) {

		this.type = type;
		this.name = name;
		this._copyright = copyright;
		this.background_image = background_image;
		this.description = description;
		this.timezone = timezone;
		this.organizer_description = organizer_description;
		this._creator = creator;
		this.end_time = end_time;
		this.state = state;
		this._call_for_papers = call_for_papers;
		this.logo = logo;
		this.code_of_conduct = code_of_conduct;
		this.schedule_published_on = schedule_published_on;
		this.social_links = social_links;
		this.topic = topic;
		this._version = version;
		this.start_time = start_time;
		this.organizer_name = organizer_name;
		this.location_name = location_name;
		this.id = id;
		this.privacy = privacy;
		this.email = email;

	}

}