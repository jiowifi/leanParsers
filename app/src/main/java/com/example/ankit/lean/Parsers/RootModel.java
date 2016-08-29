import java.util.ArrayList;

class RootModel {

	public CopyrightModel _copyright;
	public Call_for_papersModel _call_for_papers;
	public String timezone;
	public String name;
	public String state;
	public int id;
	public String end_time;
	public String type;
	public String privacy;
	public ArrayList<Social_linksModel> social_links;
	public String email;
	public String code_of_conduct;
	public String background_image;
	public String start_time;
	public String topic;
	public String organizer_description;
	public String logo;
	public CreatorModel _creator;
	public String location_name;
	public VersionModel _version;
	public String organizer_name;
	public String schedule_published_on;
	public String description;

	public RootModel(CopyrightModel copyright, Call_for_papersModel call_for_papers, String timezone, String name, String state, int id, String end_time, String type, String privacy, ArrayList<Social_linksModel> social_links, String email, String code_of_conduct, String background_image, String start_time, String topic, String organizer_description, String logo, CreatorModel creator, String location_name, VersionModel version, String organizer_name, String schedule_published_on, String description) {

		this._copyright = copyright;
		this._call_for_papers = call_for_papers;
		this.timezone = timezone;
		this.name = name;
		this.state = state;
		this.id = id;
		this.end_time = end_time;
		this.type = type;
		this.privacy = privacy;
		this.social_links = social_links;
		this.email = email;
		this.code_of_conduct = code_of_conduct;
		this.background_image = background_image;
		this.start_time = start_time;
		this.topic = topic;
		this.organizer_description = organizer_description;
		this.logo = logo;
		this._creator = creator;
		this.location_name = location_name;
		this._version = version;
		this.organizer_name = organizer_name;
		this.schedule_published_on = schedule_published_on;
		this.description = description;

	}

}