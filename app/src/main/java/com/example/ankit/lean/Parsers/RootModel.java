import java.util.ArrayList;

class RootModel {

	public CreatorModel _creator;
	public String end_time;
	public String organizer_name;
	public VersionModel _version;
	public String logo;
	public ArrayList<Social_linksModel> social_links;
	public String code_of_conduct;
	public String timezone;
	public Call_for_papersModel _call_for_papers;
	public String organizer_description;
	public String name;
	public String topic;
	public String background_image;
	public String state;
	public String privacy;
	public int id;
	public String email;
	public String location_name;
	public String schedule_published_on;
	public CopyrightModel _copyright;
	public String start_time;
	public String type;
	public String description;

	public RootModel(CreatorModel creator, String end_time, String organizer_name, VersionModel version, String logo, ArrayList<Social_linksModel> social_links, String code_of_conduct, String timezone, Call_for_papersModel call_for_papers, String organizer_description, String name, String topic, String background_image, String state, String privacy, int id, String email, String location_name, String schedule_published_on, CopyrightModel copyright, String start_time, String type, String description) {

		this._creator = creator;
		this.end_time = end_time;
		this.organizer_name = organizer_name;
		this._version = version;
		this.logo = logo;
		this.social_links = social_links;
		this.code_of_conduct = code_of_conduct;
		this.timezone = timezone;
		this._call_for_papers = call_for_papers;
		this.organizer_description = organizer_description;
		this.name = name;
		this.topic = topic;
		this.background_image = background_image;
		this.state = state;
		this.privacy = privacy;
		this.id = id;
		this.email = email;
		this.location_name = location_name;
		this.schedule_published_on = schedule_published_on;
		this._copyright = copyright;
		this.start_time = start_time;
		this.type = type;
		this.description = description;

	}

}