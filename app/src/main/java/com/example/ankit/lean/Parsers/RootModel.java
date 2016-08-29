import java.util.ArrayList;

class RootModel {

	public CreatorModel _creator;
	public int id;
	public String organizer_description;
	public String name;
	public Call_for_papersModel _call_for_papers;
	public String logo;
	public ArrayList<Social_linksModel> social_links;
	public String description;
	public String privacy;
	public String start_time;
	public String schedule_published_on;
	public String background_image;
	public VersionModel _version;
	public String end_time;
	public CopyrightModel _copyright;
	public String timezone;
	public String type;
	public String state;
	public String code_of_conduct;
	public String email;
	public String organizer_name;
	public String topic;
	public String location_name;

	public RootModel(CreatorModel creator, int id, String organizer_description, String name, Call_for_papersModel call_for_papers, String logo, ArrayList<Social_linksModel> social_links, String description, String privacy, String start_time, String schedule_published_on, String background_image, VersionModel version, String end_time, CopyrightModel copyright, String timezone, String type, String state, String code_of_conduct, String email, String organizer_name, String topic, String location_name) {

		this._creator = creator;
		this.id = id;
		this.organizer_description = organizer_description;
		this.name = name;
		this._call_for_papers = call_for_papers;
		this.logo = logo;
		this.social_links = social_links;
		this.description = description;
		this.privacy = privacy;
		this.start_time = start_time;
		this.schedule_published_on = schedule_published_on;
		this.background_image = background_image;
		this._version = version;
		this.end_time = end_time;
		this._copyright = copyright;
		this.timezone = timezone;
		this.type = type;
		this.state = state;
		this.code_of_conduct = code_of_conduct;
		this.email = email;
		this.organizer_name = organizer_name;
		this.topic = topic;
		this.location_name = location_name;

	}

}