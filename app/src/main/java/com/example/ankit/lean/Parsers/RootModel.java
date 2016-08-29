import java.util.ArrayList;

class RootModel {

	public CopyrightModel _copyright;
	public String topic;
	public String organizer_name;
	public String name;
	public String privacy;
	public String end_time;
	public VersionModel _version;
	public String location_name;
	public String timezone;
	public String logo;
	public String description;
	public String background_image;
	public ArrayList<Social_linksModel> social_links;
	public String schedule_published_on;
	public String code_of_conduct;
	public String email;
	public String type;
	public String start_time;
	public Call_for_papersModel _call_for_papers;
	public String organizer_description;
	public int id;
	public String state;
	public CreatorModel _creator;

	public RootModel(CopyrightModel copyright, String topic, String organizer_name, String name, String privacy, String end_time, VersionModel version, String location_name, String timezone, String logo, String description, String background_image, ArrayList<Social_linksModel> social_links, String schedule_published_on, String code_of_conduct, String email, String type, String start_time, Call_for_papersModel call_for_papers, String organizer_description, int id, String state, CreatorModel creator) {

		this._copyright = copyright;
		this.topic = topic;
		this.organizer_name = organizer_name;
		this.name = name;
		this.privacy = privacy;
		this.end_time = end_time;
		this._version = version;
		this.location_name = location_name;
		this.timezone = timezone;
		this.logo = logo;
		this.description = description;
		this.background_image = background_image;
		this.social_links = social_links;
		this.schedule_published_on = schedule_published_on;
		this.code_of_conduct = code_of_conduct;
		this.email = email;
		this.type = type;
		this.start_time = start_time;
		this._call_for_papers = call_for_papers;
		this.organizer_description = organizer_description;
		this.id = id;
		this.state = state;
		this._creator = creator;

	}

}