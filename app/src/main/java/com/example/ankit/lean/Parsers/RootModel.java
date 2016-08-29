import java.util.ArrayList;

class RootModel {

	public CopyrightModel _copyright;
	public String logo;
	public Call_for_papersModel _call_for_papers;
	public String type;
	public ArrayList<Social_linksModel> social_links;
	public String location_name;
	public String organizer_description;
	public String privacy;
	public CreatorModel _creator;
	public VersionModel _version;
	public String name;
	public String state;
	public String start_time;
	public String description;
	public String organizer_name;
	public String topic;
	public String email;
	public int id;
	public String timezone;
	public String code_of_conduct;
	public String schedule_published_on;
	public String background_image;
	public String end_time;

	public RootModel(CopyrightModel copyright, String logo, Call_for_papersModel call_for_papers, String type, ArrayList<Social_linksModel> social_links, String location_name, String organizer_description, String privacy, CreatorModel creator, VersionModel version, String name, String state, String start_time, String description, String organizer_name, String topic, String email, int id, String timezone, String code_of_conduct, String schedule_published_on, String background_image, String end_time) {

		this._copyright = copyright;
		this.logo = logo;
		this._call_for_papers = call_for_papers;
		this.type = type;
		this.social_links = social_links;
		this.location_name = location_name;
		this.organizer_description = organizer_description;
		this.privacy = privacy;
		this._creator = creator;
		this._version = version;
		this.name = name;
		this.state = state;
		this.start_time = start_time;
		this.description = description;
		this.organizer_name = organizer_name;
		this.topic = topic;
		this.email = email;
		this.id = id;
		this.timezone = timezone;
		this.code_of_conduct = code_of_conduct;
		this.schedule_published_on = schedule_published_on;
		this.background_image = background_image;
		this.end_time = end_time;

	}

}