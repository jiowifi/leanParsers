import java.util.ArrayList;

class RootModel {

	public CreatorModel _creator;
	public ArrayList<Social_linksModel> social_links;
	public String type;
	public String state;
	public String start_time;
	public String background_image;
	public int id;
	public CopyrightModel _copyright;
	public VersionModel _version;
	public String organizer_name;
	public String timezone;
	public Call_for_papersModel _call_for_papers;
	public String location_name;
	public String schedule_published_on;
	public String email;
	public String code_of_conduct;
	public String organizer_description;
	public String end_time;
	public String description;
	public String name;
	public String logo;
	public String topic;
	public String privacy;

	public RootModel(CreatorModel creator, ArrayList<Social_linksModel> social_links, String type, String state, String start_time, String background_image, int id, CopyrightModel copyright, VersionModel version, String organizer_name, String timezone, Call_for_papersModel call_for_papers, String location_name, String schedule_published_on, String email, String code_of_conduct, String organizer_description, String end_time, String description, String name, String logo, String topic, String privacy) {

		this._creator = creator;
		this.social_links = social_links;
		this.type = type;
		this.state = state;
		this.start_time = start_time;
		this.background_image = background_image;
		this.id = id;
		this._copyright = copyright;
		this._version = version;
		this.organizer_name = organizer_name;
		this.timezone = timezone;
		this._call_for_papers = call_for_papers;
		this.location_name = location_name;
		this.schedule_published_on = schedule_published_on;
		this.email = email;
		this.code_of_conduct = code_of_conduct;
		this.organizer_description = organizer_description;
		this.end_time = end_time;
		this.description = description;
		this.name = name;
		this.logo = logo;
		this.topic = topic;
		this.privacy = privacy;

	}

}