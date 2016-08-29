import java.util.ArrayList;

class RootModel {

	public String description;
	public String privacy;
	public String code_of_conduct;
	public String background_image;
	public String logo;
	public ArrayList<Social_linksModel> social_links;
	public String end_time;
	public VersionModel _version;
	public String state;
	public String type;
	public CreatorModel _creator;
	public String schedule_published_on;
	public Call_for_papersModel _call_for_papers;
	public String organizer_description;
	public String location_name;
	public int id;
	public String timezone;
	public String name;
	public CopyrightModel _copyright;
	public String organizer_name;
	public String topic;
	public String start_time;
	public String email;

	public RootModel(String description, String privacy, String code_of_conduct, String background_image, String logo, ArrayList<Social_linksModel> social_links, String end_time, VersionModel version, String state, String type, CreatorModel creator, String schedule_published_on, Call_for_papersModel call_for_papers, String organizer_description, String location_name, int id, String timezone, String name, CopyrightModel copyright, String organizer_name, String topic, String start_time, String email) {

		this.description = description;
		this.privacy = privacy;
		this.code_of_conduct = code_of_conduct;
		this.background_image = background_image;
		this.logo = logo;
		this.social_links = social_links;
		this.end_time = end_time;
		this._version = version;
		this.state = state;
		this.type = type;
		this._creator = creator;
		this.schedule_published_on = schedule_published_on;
		this._call_for_papers = call_for_papers;
		this.organizer_description = organizer_description;
		this.location_name = location_name;
		this.id = id;
		this.timezone = timezone;
		this.name = name;
		this._copyright = copyright;
		this.organizer_name = organizer_name;
		this.topic = topic;
		this.start_time = start_time;
		this.email = email;

	}

}